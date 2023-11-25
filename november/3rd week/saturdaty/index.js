// Select the div element
let mydiv = document.querySelector(".sample");
let innerDivValue = 0;

// Function to create and append the button
function createButton() {
  const button = document.createElement("button");
  button.id = "btn";
  button.textContent = "Increment";
  document.body.appendChild(button); // Append the button to the body

  // Add click event listener to the button
  button.addEventListener("click", function () {
    innerDivValue += 1;
    updateInnerDiv();
  });
}

// Function to update the inner div content
function updateInnerDiv() {
  mydiv.innerHTML = `<div style='background-color: red; height: 50px; width: 50px;'>${innerDivValue}</div>`;
}

// Click event for the div
mydiv.addEventListener("click", function () {
  mydiv.style.height = "200px";
  mydiv.style.width = "200px";
  updateInnerDiv();
  createButton(); // Create the button when div is clicked
});

// Subject selection logic
document.querySelectorAll('input[name="subject"]').forEach(input => {
    input.addEventListener('change', () => {
        const selectedSubjects = Array.from(document.querySelectorAll('input[name="subject"]:checked')).map(el => el.value);
        if (selectedSubjects.length > 4) {
            alert('You can only select 4 subjects');
            input.checked = false;
        } else {
            console.log('Selected Subjects:', selectedSubjects);
        }
    });
});

// Gender selection logic
document.querySelectorAll('input[name="gender"]').forEach(input => {
    input.addEventListener('change', () => {
        console.log('Selected Gender:', input.value);
    });
});