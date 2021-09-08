// Funções 
function loginEmp(){
    var user = cnpj.value;
    var senha = senhaEmp.value;
            if (user== "" || senha == "") {
                alert("informar corretamente CNPJ e/ou senha!");
                setTimeout (300);
            }
            else{
                window.location.href ="page_CadastroUser.html";
            }
}