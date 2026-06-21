DESCRICAO DO PROBLEMA
        * Em um portal universitário, existe um serviço que faz o download de gabaritos de provas armazenados
        *  em um servidor pesado (Objeto Base). Para proteger o servidor e economizar banda, implementamos um
        *  Proxy. Esse intermediário faz duas coisas:
        *      Controle de Acesso: Verifica se o usuário tentando baixar o arquivo é um aluno matriculado ou
        *       se tem a permissão correta.
        *      Cache: Se o arquivo já foi baixado uma vez, o proxy entrega a cópia local imediatamente, sem
        *      sobrecarregar o servidor real.
        * 
