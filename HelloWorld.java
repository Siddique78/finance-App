<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang = "en">

<head>

<link rel="shortcut icon" href="https://introcs.cs.princeton.edu/favicon.ico">
<link rel="stylesheet"    href="https://introcs.cs.princeton.edu/java.css" type="text/css">

<title>HelloWorld.java</title>

<meta HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=iso-8859-1">
<meta NAME="AUTHOR" CONTENT="Robert Sedgewick and Kevin Wayne">
<meta NAME="DESCRIPTION" CONTENT="HelloWorld code in Java">
<meta NAME="TITLE" CONTENT="HelloWorld code in Java">
<meta NAME="KEYWORDS" CONTENT="HelloWorld,java,programming,computer science,algorithm,program,code">
<meta NAME="ROBOTS" CONTENT="INDEX,FOLLOW">

</head>


<body>
<center><h1>HelloWorld.java</h1></center><p><br>

Below is the syntax highlighted version of <a href = "HelloWorld.java">HelloWorld.java</a>
from <a href = "https://introcs.cs.princeton.edu/java/11hello">&#167;1.1 Hello World</a>.
<p><br>

<!-- Generator: GNU source-highlight 3.1.6
by Lorenzo Bettini
http://www.lorenzobettini.it
http://www.gnu.org/software/src-highlite -->
<pre><tt><span class="comment">/******************************************************************************</span>
<span class="comment"> *  Compilation:  javac HelloWorld.java</span>
<span class="comment"> *  Execution:    java HelloWorld</span>
<span class="comment"> *</span>
<span class="comment"> *  Prints "Hello, World". By tradition, this is everyone's first program.</span>
<span class="comment"> *</span>
<span class="comment"> *  % java HelloWorld</span>
<span class="comment"> *  Hello, World</span>
<span class="comment"> *</span>
<span class="comment"> *  These 17 lines of text are comments. They are not part of the program;</span>
<span class="comment"> *  they serve to remind us about its properties. The first two lines tell</span>
<span class="comment"> *  us what to type to compile and test the program. The next line describes</span>
<span class="comment"> *  the purpose of the program. The next few lines give a sample execution</span>
<span class="comment"> *  of the program and the resulting output. We will always include such </span>
<span class="comment"> *  lines in our programs and encourage you to do the same.</span>
<span class="comment"> *</span>
<span class="comment"> ******************************************************************************/</span>

<span class="keyword">public</span><span class="normal"> </span><span class="keyword">class</span><span class="normal"> </span><span class="classname">HelloWorld</span><span class="normal"> </span><span class="cbracket">{</span>

<span class="normal">    </span><span class="keyword">public</span><span class="normal"> </span><span class="keyword">static</span><span class="normal"> </span><span class="type">void</span><span class="normal"> </span><span class="function">main</span><span class="symbol">(</span><span class="normal">String</span><span class="symbol">[]</span><span class="normal"> args</span><span class="symbol">)</span><span class="normal"> </span><span class="cbracket">{</span>
<span class="normal">        </span><span class="comment">// Prints "Hello, World" to the terminal window.</span>
<span class="normal">        System</span><span class="symbol">.</span><span class="normal">out</span><span class="symbol">.</span><span class="function">println</span><span class="symbol">(</span><span class="string">"Hello, World"</span><span class="symbol">);</span>
<span class="normal">    </span><span class="cbracket">}</span>

<span class="cbracket">}</span>
</tt></pre>

<script type="text/javascript">
var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
</script>
<script type="text/javascript">
try {
var pageTracker = _gat._getTracker("UA-10811519-1");
pageTracker._trackPageview();
} catch(err) {}</script>

</body>

<p><br><address><small>
Copyright &copy; 2000&ndash;2017, Robert Sedgewick and Kevin Wayne.
<br>Last updated: Fri Oct 20 14:12:12 EDT 2017.
</small></address>

</html>

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World"); 
	System.out.println("welcome to git");
    }
}
