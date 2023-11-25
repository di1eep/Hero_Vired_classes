// JavaScript Logic:

// Implement the JavaScript logic to add, delete, and mark tasks as completed.
// Write a function to add a new task to the list when the user clicks the "Add Task" button.
// Write a function to delete a task when the user clicks the "Delete" button next to the task.
// Write a function to mark a task as completed when the user checks the checkbox next to the task.
// User Interaction:

// Allow users to input tasks into the input field.
// Display tasks in an organized manner with options to mark them as completed or delete them.
// Provide feedback to users when tasks are added, deleted, or marked as completed.
const button =document.querySelector('button');

button.addEventListener('click',addtask)
function addtask(){
    // select and get value of input box
    //select the btn and add a event click
    const inputBox =document.getElementById('taskInput');
    const taskUL =document.getElementById('taskList'); //Ul tag
    console.log(inputBox.value,"this is input value");

    if(inputBox.value !==""){
        //we will create li;
        //we will append this to UL
        
        const li =document.createElement('li');
        // li.innerText=inputBox.value;
        
        li.innerHTML=`
        <span>${inputBox.value}</span>
            <button onclick=deletetask(this)>Delete</button>
            <input type='checkbox' onchange=completetask(this)>
        `
        taskUL.appendChild(li);
        inputBox.value=''
    }
}

function deletetask(button){
    //this : special keyword in js
    // this points to the object in which it is called;
//    parentElement, remove();

    const li= button.parentElement;
    console.log(li);
    li.remove();
}

function completetask(input){
    // console.log(input,"this is what this keyword is pointing");
    const span =input.parentElement.querySelector('span');
    console.log(span,"span tag value");
   if(input.checked){
    // task should be completed marked.
    span.style.textDecoration="line-through";
   }else{
    span.style.textDecoration="none";
   }

}