
var contador = 0;

function mostrar_cadastrado(impar) {
    contador++;
    contador % 2 == impar ? 
        document.getElementById("tabela_cadastrado").classList.toggle("tabela_cadastrados") 
        : document.getElementById("tabela_cadastrado").classList.toggle("tabela_escondida");
    return;
}

function cadastrar() {
    // aguardar();
    var email = inp_email.value;

        if (email.indexOf('@') == -1 && email.indexOf('.com') == -1) {
            // o valor será verdadeiro quando estiver sem @ ou .com, ou seja, retornar um valor do indexOf igual à -1

            alert(`O email ${email} é um email INVÁLIDO`);

        } else {
    var formulario = new URLSearchParams(new FormData(form_cadastro));
    fetch("/usuarios/cadastrar", {
        method: "POST",
        body: formulario
    }).then(function (response) {
        
        if (response.ok) {

            window.location.href='cadastro_confir.html';

        }
    });

}
    return false;
}