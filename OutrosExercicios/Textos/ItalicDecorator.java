public class ItalicDecorator extends Decorator
{
  /**
   * Construtor para inicializar o componente
   *
   * @param component referencia para um objeto Component
   */
  public ItalicDecorator(Text component)
  {
    super(component);
  }

  /* (non-Javadoc)
   * @see com.ybadoo.tutoriais.poo.TextStyle#render()
   */
  public String render()
  {
    return "<i>" + super.render() + "</i>";
  }
}