const containerEl = document.querySelector('.container');

const careers = ['YouTuber', 'Web Developer', 'Freelancer', 'Instructor'];

let careerIndex = 0; // index of occupation

let characterIndex = 0; // latters index of each word

function updateText() {
  characterIndex++;
  containerEl.innerHTML = `
    <h1>I am ${careers[careerIndex].slice(0, 1) === 'I' ? 'an' : 'a'} ${careers[
    careerIndex
  ].slice(0, characterIndex)}</h1>
    `;

  console.log(characterIndex, careerIndex);

  if (characterIndex === careers[careerIndex].length) {
    careerIndex++;
    characterIndex = 0;
  }

  if (careerIndex === careers.length) {
    careerIndex = 0;
  }
  setTimeout(updateText, 300);
}

updateText();
