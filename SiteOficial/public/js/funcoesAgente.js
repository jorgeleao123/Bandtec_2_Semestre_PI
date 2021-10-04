// Funções 
function loginAgente(){
    var user = usuarioAgente.value;
    var senha = senhaAgente.value;
            if (user== "" || senha == "") {
                alert("informar corretamente usuario e/ou senha!");
                setTimeout (300);
            }
            else{
                window.location.href ="dashboard.html";
            }
}