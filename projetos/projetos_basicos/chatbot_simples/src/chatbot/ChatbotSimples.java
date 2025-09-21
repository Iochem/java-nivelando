package projetos_basicos.chatbot_simples.src.chatbot;

import java.util.Scanner;

public class ChatbotSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Mensagem inicial do chatbot
        System.out.println("🤖 Chatbot: Olá! Como posso ajudar você?");

        // Loop infinito para manter a conversa até o usuário encerrar
        while (true) {
            System.out.print("Você: ");
            input = scanner.nextLine().toLowerCase(); // Converte a entrada para minúsculas (facilita a comparação)

            // Respostas pré-definidas com base em palavras-chave
            if (input.contains("ola") || input.contains("oi")) {
                System.out.println("🤖 Chatbot: Olá! Como você está?");
            } else if (input.contains("bem")) {
                System.out.println("🤖 Chatbot: Que bom! Como posso te ajudar?");
            } else if (input.contains("qual seu nome")) {
                System.out.println("🤖 Chatbot: Meu nome é ChatBotJava!");
            } else if (input.contains("adeus") || input.contains("tchau")) {
                // Encerra a execução se o usuário se despede
                System.out.println("🤖 Chatbot: Até mais! Tenha um ótimo dia!");
                break;
            } else {
                // Resposta padrão caso não entenda o que foi digitado
                System.out.println("🤖 Chatbot: Desculpe, não entendi. Pode reformular?");
            }
        }
        // Boa prática: fechar o Scanner ao final do programa
        scanner.close();
    }
}

/*
 * OBS:
 * - O uso de .contains() permite identificar variações de texto.
 *   Ex: Mesmo que o usuário digite "oiiiiiiiii", ainda será reconhecido, pois a string contém "oi".
 */
