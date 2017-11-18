public class PigLatin{

	//variables
	private String text;
	private String outputText;

	//setter
	public void setText(String text){
		this.text = text;
		}
	//getter
	public String getText(){
		return outputText;
		}

	//METHODS

	public void translateToPigLatin(){

		StringBuffer sb = new StringBuffer();
		int len = text.length();

		for(int i = 1; i < len; i++){
				sb.append(text.charAt(i));
		}

		sb.append(text.charAt(0));
		sb.append("ay");

		outputText = sb.toString();

	}

}
