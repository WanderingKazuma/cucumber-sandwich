package net.masterthought.cucumber.sandwich;

import com.beust.jcommander.Parameter;

public class SandwichParameters {

    @Parameter(names = "-f", required = true, description = "Folder to monitor for cucumber.json report files")
    private String folder;

    @Parameter(names = "-o", required = true, description = "Output directory to generate the cucumber-html-reports into")
    private String outDir;

    @Parameter(names = "-noServer", required = false, description = "Run and check folders once without starting a server")
    private String noServer;

    public String getFolder(){
        return folder;
    }

    public String getOutDir(){
        return outDir;
    }

    public boolean getServerOption() { return noServer.equals("true"); }

}
