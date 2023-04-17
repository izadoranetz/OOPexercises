public class Word implements Text
{
  /**
   * Palavra
   */
  private String word;

  /**
   * Construtor para inicializar a palavra
   *
   * @param word palavra
   */
  public Word(String word)
  {
    this.word = word;
  }

  /* (non-Javadoc)
   * @see com.ybadoo.tutoriais.poo.TextStyle#render()
   */
  public String render()
  {
    return word;
  }
}