/***********           LICENSE HEADER   *******************************
import java.nio.ByteOrder;
        ByteBuffer buffer = ByteBuffer.allocate((int) bufsize);
		buffer.order(ByteOrder.LITTLE_ENDIAN);
		buffer.clear();	int pos = 0;
        msg.encode(buffer, pos);