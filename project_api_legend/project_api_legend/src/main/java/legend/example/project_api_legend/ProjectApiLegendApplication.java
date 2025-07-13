package legend.example.project_api_legend;

import java.awt.Desktop;
import java.net.URI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
// @EnableJpaRepositories(basePackages = "legend.example.project_api_legend.Repository.Login")
public class ProjectApiLegendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApiLegendApplication.class, args);
	}

     @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            String url = "http://localhost:8080/Html/index.html";
            String os = System.getProperty("os.name").toLowerCase();

            try {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().browse(new URI(url));
                } else {
                    // Fallback to OS-specific browser launch
                    if (os.contains("win")) {
                        Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start", "chrome", url});
                    } else if (os.contains("mac")) {
                        Runtime.getRuntime().exec(new String[]{"open", "-a", "Google Chrome", url});
                    } else if (os.contains("nix") || os.contains("nux")) {
                        Runtime.getRuntime().exec(new String[]{"google-chrome", url});
                    } else {
                        System.err.println("Unsupported OS: cannot open browser.");
                    }
                }
            } catch (Exception e) {
                System.err.println("Failed to open browser: " + e.getMessage());
            }
        };
    }

	// @Bean
	// public CommandLineRunner commandLineRunner(){
	// 	return args -> {
    //         // URL of the HTML file (e.g., http://localhost:8080/index.html)
    //         String url = "http://localhost:8080/Html/index.html";

    //         // Check the operating system
    //         String os = System.getProperty("os.name").toLowerCase();
    //         try {
    //             if (os.contains("win")) {
    //                 // For Windows
    //                 Runtime.getRuntime().exec("cmd /c start chrome " + url);
    //             } else if (os.contains("mac")) {
    //                 // For macOS
    //                 Runtime.getRuntime().exec("open -a \"Google Chrome\" " + url);
    //             } else if (os.contains("nix") || os.contains("nux")) {
    //                 // For Linux
    //                 Runtime.getRuntime().exec("google-chrome " + url);
    //             }
    //         } catch (Exception e) {
    //             System.err.println("Failed to open browser: " + e.getMessage());
    //         }
    //     };
	// }

}
