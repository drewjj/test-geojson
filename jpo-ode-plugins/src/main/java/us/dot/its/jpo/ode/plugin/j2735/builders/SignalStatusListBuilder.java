package us.dot.its.jpo.ode.plugin.j2735.builders;

import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;

import us.dot.its.jpo.ode.plugin.j2735.J2735SignalStatusList;

public class SignalStatusListBuilder {
    private SignalStatusListBuilder() {
		throw new UnsupportedOperationException();
	}

	public static J2735SignalStatusList genericSignalStatusList(JsonNode status) {
		J2735SignalStatusList signalStatusList = new J2735SignalStatusList();

		if (status.isArray()) {
			Iterator<JsonNode> elements = status.elements();

			while (elements.hasNext()) {
				signalStatusList.getStatus()
                    .add(SignalStatusBuilder.genericSignalStatus(elements.next()));
			}
		} else {
			JsonNode signalStatus = status.get("SignalStatus");
			if(signalStatus != null)
			{
				signalStatusList.getStatus()
					.add(SignalStatusBuilder.genericSignalStatus(signalStatus));
			}
		}
		
		return signalStatusList;
	}
}
