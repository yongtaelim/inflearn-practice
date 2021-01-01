package com.example.inflearnpractice.whiteship.forweek;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.List;

public class Dashboard {

    private static final String MY_TOKEN = "+FlBmEawPboApyfqKigNAZ1NFwvbF+0iAgJyvkblqJo=";
    private static final String REPOSITORY_NAME = "whiteship/live-study";

    public static void main(String[] args) throws IOException {
        GitHub gitHub = new GitHubBuilder().withOAuthToken(MY_TOKEN).build();

        GHRepository ghRepository = gitHub.getRepository(REPOSITORY_NAME);

        List<GHIssue> issue = ghRepository.getIssues(GHIssueState.ALL);
        for (GHIssue ghIssue : issue) {
            System.out.println(ghIssue.getComments());
        }

    }
}
