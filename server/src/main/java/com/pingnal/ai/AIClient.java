package com.pingnal.ai;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class AIClient {

    public static String GEMINI_API_KEY;

    public static void main(String[] args) {
        Client client = Client.builder().apiKey(GEMINI_API_KEY).build();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        "Explain how AI works in a few words",
                        null);

        System.out.println(response.text());
    }
}
