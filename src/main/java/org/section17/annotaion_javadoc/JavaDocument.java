package org.section17.annotaion_javadoc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

    /**
     * The {@code Basics} class demonstrates basic exception handling and logging
     * using the SLF4J Logger. This class also serves as an example for generating
     * and understanding Javadoc in IntelliJ IDEA.
     *
     * <h2>Steps to Generate Javadoc in IntelliJ IDEA:</h2>
     * <ol>
     *     <li><b>Open Your Project:</b>
     *         <p>Open the Java project in IntelliJ IDEA for which you want to generate the documentation.</p>
     *     </li>
     *     <li><b>Navigate to the Javadoc Tool:</b>
     *         <p>Go to the menu bar and select <b>Tools > Generate Javadoc</b>.</p>
     *     </li>
     *     <li><b>Configure Javadoc Settings:</b>
     *         <ul>
     *             <li><b>Scope:</b> Choose the classes or packages for which you want to generate the Javadoc.</li>
     *             <li><b>Output Directory:</b> Specify the folder where the generated Javadoc files will be saved.</li>
     *             <li><b>JavaDoc Command:</b> Ensure the path to the Javadoc executable is correctly set (usually comes with the JDK).</li>
     *             <li><b>Additional Options:</b> Include tags like {@code @param} or {@code @return} in your comments as needed.</li>
     *         </ul>
     *     </li>
     *     <li><b>Run Javadoc Generation:</b>
     *         <p>Click <b>OK</b> or <b>Generate</b> to create the documentation. IntelliJ will execute the Javadoc command, and the progress will appear in the tool window.</p>
     *     </li>
     *     <li><b>View Generated Javadoc:</b>
     *         <p>Navigate to the output directory you specified and open the <b>index.html</b> file in a browser to view the Javadoc.</p>
     *     </li>
     * </ol>
     *
     * <h2>Commonly Used Javadoc Tags:</h2>
     * <ul>
     *     <li>{@code @code} - Used to indicate inline code snippets (e.g., {@code main}).</li>
     *     <li>{@code @link} - Provides a hyperlink to another class or method in the Javadoc.</li>
     *     <li>{@code @author} - Specifies the author of the class.</li>
     *     <li>{@code @version} - Specifies the version of the class.</li>
     *     <li>{@code @since} - Indicates when this class was first introduced or modified.</li>
     *     <li>{@code @param} - Describes a method parameter.</li>
     * </ul>
     *
     * @author Ramya
     * @version 1.0
     * @since 2025-01-15
     */
    public class JavaDocument {
        /**
         * A static {@link Logger} instance for logging messages in the {@code Basics} class.
         */
        private static final Logger logger = LoggerFactory.getLogger(JavaDocument.class);

        /**
         * The entry point of the application. This method logs details about Javadoc tags
         * and a general informational message using SLF4J's {@code Logger}.
         *
         * @param args command-line arguments passed during application execution (not used in this example)
         */
        public static void main(String[] args) {
            // General informational log
            logger.info("Logging Javadoc tags usage and details:");

            // Logging Javadoc tag details
            logger.info("@code - Used to indicate inline code snippets (e.g., {@code main}).");
            logger.info("@link - Provides a hyperlink to another class or method in the Javadoc.");
            logger.info("@author - Specifies the author of the class.");
            logger.info("@version - Specifies the version of the class.");
            logger.info("@since - Indicates when this class was first introduced or modified.");
            logger.info("@param - Describes a method parameter.");
        }
    }
