// Define the API endpoint
const resp = fetch('https://jsonplaceholder.typicode.com/users');

// console.log(apiUrl)
resp
.then(resp=>resp.json())
.then(json=>console.log(json))
.catch(err=>console.log(err))
.finally(()=>console.log('promise executed'))
