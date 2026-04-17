<div align="center">
  <h1>☕ Java Conditional Structures</h1>
  <p>Exercícios de lógica (Nélio Alves & Beecrowd) resolvidos com o que há de mais novo no Java 25.</p>
</div>

<hr>

<blockquote>
  <b>⚠️ Nota sobre o histórico:</b> Se você notar poucos commits, é porque precisei fazer uma limpeza pesada no repositório para remover arquivos de configuração da IDE (.idea, out, .iml) que acabaram subindo por erro de rastreio. Resetei o histórico para manter o projeto limpo e profissional.
</blockquote>

<h2>📖 O que é este projeto?</h2>
<p>
  Aqui estão as minhas resoluções para os desafios de <b>Estrutura Condicional</b>. A ideia não foi só resolver os exercícios, mas aplicar as novidades do Java (JDK 21 ao 25) para escrever um código mais limpo e sem aquela "burocracia" (boilerplate) de antigamente.
</p>

<h2>🛠️ O que usei de Java Moderno</h2>
<ul>
  <li><b>Fim do "public class":</b> Usei <i>Implicitly Declared Classes</i>. O código começa direto nos métodos, sem precisar envolver tudo em uma classe Main.</li>
  <li><b>Main simplificado:</b> Nada de <code>static void main(String[] args)</code>. O Java 25 permite um <code>main</code> muito mais direto.</li>
  <li><b>Println direto:</b> Importei o <code>java.lang.IO</code> de forma estática, então uso apenas <code>println()</code> em vez do longo <code>System.out.println()</code>.</li>
  <li><b>Switch moderno:</b> No menu principal, usei <i>Switch Expressions</i> com setas (<code>-></code>). É bem mais seguro e você não esquece o <code>break</code>.</li>
</ul>

<h2>💡 Como resolvi os problemas</h2>
<p>
  Tentei equilibrar o jeito que o mercado usa hoje com o que está vindo por aí:
</p>

<ul>
  <li><b>Lógica Progressiva:</b> No cálculo de Imposto de Renda (Ex 08), usei <code>if/else</code> clássico para garantir que os cálculos por faixas ficassem perfeitos e estáveis.</li>
  <li><b>R$ Automático:</b> No exercício de preços (Ex 05), usei <code>NumberFormat</code> com <code>Locale</code> brasileiro para o Java colocar o símbolo de Real e as vírgulas sozinho.</li>
  <li><b>Ponto vs Vírgula:</b> Configurei o <code>Locale.setDefault(Locale.US)</code> logo no início. Assim o terminal aceita o ponto decimal (padrão de programador) e evita aquele erro chato de <i>InputMismatch</i>.</li>
</ul>

<hr>

<h2>🧪 Bônus: Testando o futuro</h2>
<p>
  Deixei comentado no código um estudo sobre <b>Pattern Matching para tipos primitivos</b>. É um jeito de fazer o switch entender intervalos de números (usando <code>when</code>). Não ativei no código principal para não precisar de flags experimentais, mas o rascunho está lá para quem quiser ver.
</p>

<details>
  <summary>🔎 Ver rascunho do Switch moderno</summary>

```java
// Estudo de Pattern Matching comentado no Exercício 8
double impostoDeRenda = switch (renda) {
    case double r when r <= 2000.00 -> 0.0;
    case double r when r <= 3000.00 -> (r - 2000.00) * 0.08;
    case double r when r > 4500.00  -> ...
    default -> 0.0;
};




