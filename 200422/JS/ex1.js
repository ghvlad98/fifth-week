
function checkMatricola(el) {
    let mat = el.value;
    if (mat < 1 || mat > 2000) {
        alert("Write appropriate number!");
        return false;
    }
}


function checkNome(el) {
    let nome = el.value;
    let re = new RegExp('\S+[A-Za-z-`a-ú.\s_-][\a-z]+$');
    if (!(re.test(nome))) {
        alert("Invalid string!");
        return false;
    }
}