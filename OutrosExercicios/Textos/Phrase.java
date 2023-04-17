import java.util.LinkedList;
import java.util.List;

/**
 * Classe responsavel pela representacao de uma frase
 */
public class Phrase
{
  /**
   * Palavras que compoem a frase
   */
  private List<Text> words;

  /**
   * Construtor padrao
   */
  public Phrase()
  {
    words = new LinkedList<Text>();
  }

  /**
   * Adicionar uma palavra a frase
   *
   * @param word palavra a ser adicionada a frase
   */
  public void add(Text word)
  {
    words.add(word);
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  public String toString()
  {
    StringBuilder str = new StringBuilder();

    for(Text word: words)
    {
      str.append(word.render()).append(' ');
    }

    return str.toString();
  }
}