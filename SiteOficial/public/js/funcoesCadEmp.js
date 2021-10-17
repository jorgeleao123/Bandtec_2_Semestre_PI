// Funções 
function cadastrarEmp(){
    var nomeEmpresa = nomeEmp.value;
    var cnpj = cnpjEmp.value;
    var senhaEmpresa = senhaEmp.value;
            if (nomeEmpresa == "" || senhaEmpresa == "") {
                alert("Favor informar Razão Social!");
                setTimeout (300);
            }
            else if(cnpj == ""){
                alert("Favor informar corretamente seu CNPJ");
            }
            else{
                window.location.href ="login.html";
            }
}