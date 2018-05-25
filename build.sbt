enablePlugins(GitBookPlugin)

enablePlugins(TutPlugin)

sourceDirectory in GitBook := tutTargetDirectory.value

gitbookInstallDir in GitBook := Some(baseDirectory.value / "node_modules" / "gitbook")

// you MUST run "tut" first, and THEN "makeSite"