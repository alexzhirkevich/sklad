package protocol.result;

import message.MessageException;

public class ResultException extends MessageException {

	public ResultException(byte result){
		super("Invalid "+ Result.class.getName() +": " + result);
	}

	public ResultException(String str){
		super(str);
	}
}
