function formatarTelefone(telefone) {
    var valor = telefone.value;
    valor = valor.replace(/\D/g, ""); // Remove caracteres não numéricos
    valor = valor.replace(/(\d{2})(\d)/, "($1) $2"); // Adiciona parênteses e espaço após os dois primeiros dígitos
    valor = valor.replace(/(\d{5})(\d)/, "$1-$2"); // Adiciona traço após o quinto dígito
    telefone.value = valor;
}
document.getElementById('formulario-registro').addEventListener('submit', function(event) {
    var senha = document.getElementById('senha').value;
    var confirmarSenha = document.getElementById('confirmar-senha').value;
    
    if (senha !== confirmarSenha) {
        alert('As senhas não coincidem.');
        event.preventDefault(); // Impede o envio do formulário
    }
});