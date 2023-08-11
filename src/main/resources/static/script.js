
        function submitForm() {
            event.preventDefault(); // Prevent the default form submission behavior

            const form = document.getElementById('form');
            console.log('form', form);
            const formData = new FormData(form);
console.log('formData', formData);
            // Create an object with form field values
            const formValues = {};
            formData.forEach((value, key) => {
                formValues[key] = value;
            });
console.log('formValues', formValues);
             Send a POST request with JSON data

            fetch('http://localhost:8080/surveyform/submit', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify() // Convert form values to JSON
            })
            .then(response => response.json())
            .then(data => {
                // Handle success response (if needed)
                console.log('Data submitted successfully:', data);
            })
            .catch(error => {
                // Handle error (if needed)
                console.error('Error submitting data:', error);
            });
        }


