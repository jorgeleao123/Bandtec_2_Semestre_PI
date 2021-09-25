
var contador = 0;

function mostrar_cadastrado(impar) {
    contador++;
    contador % 2 == impar ? 
        document.getElementById("tabela_cadastrado").classList.toggle("tabela_cadastrados") 
        : document.getElementById("tabela_cadastrado").classList.toggle("tabela_escondida");
    return;
}