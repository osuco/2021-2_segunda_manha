# 2021-2 - Segunda - Manhã

**Disciplina:** Programação Avançada em Orientação a Objetos

**professor:** Thiago Graziani Traue (thiago.traue@uni9.pro.br)

***

# Preparação do ambiente de desenvolvimento


Para essa disciplina o professor utilizará o Netbeans. Existem duas versões do Netbeans atualmente, 8.2 e 12.x. O Netbeans (NB) 8 é oficial da Oracle (última versão disponibilizada), já o NB 12 em diante é mantido pela fundação Apache. Nessa disciplina o professor utilizará o NB 8.

Se você utiliza Windows, antes de instalar o Netbeans, você precisa ter certeza que seu Sistema Operacional possui o Java instalado. Para isso, abra o terminal (prompt de comando) e digite:

```
java -version
```

Se aparecer a versão do Java, tudo ok. Caso o comando não seja reconhecido, recomenda-se baixar e instalar o Java [neste link](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)


## Como instalar o NB 8

O professor disponibiliza duas fontes:


1. Site oficial da Oracle, [NESTE LINK](https://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html) - Aceite os termos da licença, copie o link correto da sua versão de Sistema Operacional e abra em uma nova guia.

2. Drive público do professor, [NESTE LINK](https://drive.google.com/drive/folders/1A6m2I43PgUcC5NloemJXM-TefbyYh6EL?usp=sharing)


A instalação do NB 8.2 é bastante simples, basta executar o instalar. **Recomenda-se fortemente** que o NB seja instalado no local padrão OU em um local cujo caminho não contenha espaços e/ou caracteres especiais.

Após a instalação, abra o NB e clique em "Ferramentas" -> "Plug-ins". Em seguida, clique na aba "Plug-ins disponíveis".

No campo de pesquisa, pesquisar por "EE". Selecionar:

 - EJB e EAR
 - Java EE Base

Clicar no botão "instalar". Aceitar os termos das licenças e instalar normalmente.

Ao finalizar a instalação, será solicitado o reinicio do NB. Clique em sim.

Feito isso, verifique se você consegue criar projetos web com o NB, clicanco em "Arquivo" -> "Novo Projeto"

## Como instalar o NB 12 (opcional)


A instalação do NB 12 é bastante simples:

1. Baixe e instale a JDK mais recente [NESTE LINK](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)


2. Acrescente a variável "JAVA_HOME" em seu Sistema. Para usuários Windows, [clique aqui](https://confluence.atlassian.com/confbr1/configurando-a-variavel-java_home-no-windows-933709538.html)


3. Baixe e instale normalmente o NB 12 mais recente, [NESTE LINK](https://netbeans.apache.org/)


## Configurar o GlassFish no NB


Você pode baixar o GlassFish de qualquer um dos links abaixo:

1. Site oficial do GlassFish: [NESTE LINK](https://javaee.github.io/glassfish/download). Baixar a versão "Web Profile"

2. Do drive do professor, [NESTE LINK](https://drive.google.com/drive/folders/1A6m2I43PgUcC5NloemJXM-TefbyYh6EL?usp=sharing)


Baixe e extraia o conteúdo do arquivo zip. Você obterá uma pasta chamada "glassfish5" com três subpastas ("bin", "glassfish" e "javadb").

Recorte a pasta raíz ("glassfish5") para um local seguro, ou seja, para um local onde você tenha certeza que não irá excluir acidentalmente e que não tenha espaços ou caracteres especiais.

Feito isso, abrir o NB, clicar em "Janela" -> "Serviços".

Clicar com o botão direito no serviço "Servidores" e selecionar "Adicionar Servidor".

No assistente que abrir, selecione "GlassFish Server" e clique em próximo.

No passo seguinte, é preciso determinar o local de instalação. Este deve ser a mesma pasta extraída do passo inicial ("glassfish5").

**Sugestão** no passo seguinte, escrever "domain2", desmarcar a opção "default" para a porta, e subir uma porta para cada (4849 e 8081, respectivamente).

Não coloque nenhuma senha!

Clique em próximo e, se o windows pedir permissão no firewall, permitir.
