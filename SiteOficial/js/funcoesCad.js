function btn_Login() {
    var social = nome_empresa.value;
    var cnpj = cnpj_empresa.value;
    var senha = senha_cadastro.value;
    var senha_confirmar = confirma_senha.value;

    if (social == "" || cnpj == "") {
        alert('Por favor, preencha o campo Razão Social ou CNPJ');
    } else if (senha == "" || senha_confirmar == "") {
        alert('Campos de senha não conferem');
    }
}