<div align="center">
  <h1>☕ Java Conditional Structures</h1>
  <p><i>Resolução de desafios de lógica com o poder e a elegância do Java Moderno (JDK 25).</i></p>
</div>

<hr>

<h2>📖 Descrição</h2>
<p>
  Este repositório reúne as minhas resoluções para os exercícios de <b>Estrutura Condicional</b> do curso do <b>Prof. Nélio Alves</b> e da plataforma <b>Beecrowd</b>. 
  O diferencial deste projeto é o uso das novas <b>JEPs (Java Enhancement Proposals)</b> para criar um código limpo, focado na lógica e livre de burocracias (boilerplate).
</p>

<h2>🛠️ Recursos Modernos Utilizados (Java 21+)</h2>
<ul>
  <li><b>Implicitly Declared Classes (JEP 463):</b> Removi a estrutura clássica de <code>public class</code>, mantendo o código focado diretamente nos métodos.</li>
  <li><b>Flexible Main Methods:</b> O método <code>main</code> não exige mais os modificadores <code>static</code> ou o parâmetro <code>String[] args</code>.</li>
  <li><b>Static IO Imports (JEP 477):</b> Uso de importações estáticas para <code>println</code> e <code>print</code>, tornando o código mais conciso.</li>
  <li><b>Switch Expressions:</b> Menu principal implementado com a sintaxe de setas (<code>-></code>), eliminando o uso manual de <code>break</code>.</li>
</ul>

<h2>💡 Diferentes Abordagens</h2>
<p>
  Optei por alternar entre estilos de codificação para demonstrar versatilidade:
</p>

<table align="center">
  <tr>
    <th>Abordagem</th>
    <th>Exemplo no Código</th>
    <th>Meu Objetivo</th>
  </tr>
  <tr>
    <td><b>Clássica (Imperativa)</b></td>
    <td><code>if / else if</code> (Ex: Exercício 8)</td>
    <td>Garantir cálculos precisos por faixas de valores sem depender de recursos experimentais (Preview).</td>
  </tr>
  <tr>
    <td><b>Internacionalização</b></td>
    <td><code>NumberFormat</code> (Ex: Exercício 5)</td>
    <td>Formatar moedas automaticamente para o padrão brasileiro (<b>R$</b>) usando <code>Locale</code>.</td>
  </tr>
  <tr>
    <td><b>Globalização de Input</b></td>
    <td><code>Locale.setDefault(Locale.US)</code></td>
    <td>Padronizar a entrada de dados (Scanner) com ponto decimal para evitar erros de sistema.</td>
  </tr>
</table>

<hr>

<h2>🧪 Extra: Exploração de Java Experimental</h2>
<p>
  Durante o desenvolvimento, explorei o uso de <b>Pattern Matching para tipos primitivos (JEP 455)</b>. 
  Embora o código torne a lógica mais declarativa, optei por deixá-lo apenas como <b>comentário</b> no código fonte para manter a compatibilidade estável.
</p>

<details>
  <summary><b>Clique para ver o rascunho com Pattern Matching</b></summary>
  <br>

```java
// Estudo de Pattern Matching (atualmente comentado no Exercício 8)
double impostoDeRenda = switch (renda) {
    case double r when r <= 2000.00 -> 0.0;
    case double r when r <= 3000.00 -> (r - 2000.00) * 0.08;
    case double r when r <= 4500.00 -> (1000.00 * 0.08) + (r - 3000.00) * 0.18;
    case double r when r > 4500.00  -> (1000.00 * 0.08) + (1500.00 * 0.18) + (r - 4500.00) * 0.28;
    default -> 0.0;
};
````
<h2>🚀 Como Executar</h2>
<p>
  Como este projeto utiliza a estrutura de <b>Single-File Source-Code</b> do Java moderno, você não precisa compilar manualmente para testar. Basta ter o <b>JDK 25</b> instalado.
</p>

<p>No seu terminal, dentro da pasta do projeto, execute:</p>

```bash
java Main.java





