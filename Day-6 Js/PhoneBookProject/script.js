let contacts = [];

function displayContacts() {
    let data = ''
    for (let contact of contacts) {
        data += `<tr>
                    <td>${contact.id}</td>
                    <td>${contact.name}</td>
                    <td>${contact.phone}</td>
                    <td><button class='btn btn-danger' 
                    onclick='deleteContact(${contact.id})'>X</button>
                    
                    <button class='btn btn-success' 
                    onclick='viewContact(${contact.id})'>edit</button>
                    </td>
                </tr>`
    }
    document.getElementById('contacts').innerHTML = data;
}
function updateContact() {
    const id = parseInt(document.getElementById('id1').value);
    const name = document.getElementById('name1').value;
    const phone = document.getElementById('phone1').value;
    const index = contacts.findIndex((item) => item.id == id);//index to be updated
    contacts[index] = { id, name, phone };
    displayContacts();
}
function viewContact(id) {
    const contact = contacts.find((item) => item.id == id);
    document.getElementById('id1').value = contact.id;
    document.getElementById('name1').value = contact.name;
    document.getElementById('phone1').value = contact.phone;
}
function deleteContact(id) {
    // const index = contacts.findIndex((item) => item.id == id);
    // contacts.splice(index, 1);
    contacts = contacts.filter((item)=>item.id!==id); //ES6
    displayContacts();
}
function addContact() {
    const name = document.getElementById('name').value;
    const phone = document.getElementById('phone').value;

    if (name.trim() == '' || phone.trim() == '') {
        alert("Name and Phone fields are mandatory")
    } else {
        const obj = { id: contacts.length + 1, name, phone };
        contacts.push(obj); //contact stored in contacts array
        document.getElementById('name').value = ''
        document.getElementById('phone').value = ''
        displayContacts();
    }
}