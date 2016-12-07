enablePlugins(GitBookPlugin)

tutSettings

sourceDirectory in GitBook := tutTargetDirectory.value
makeSite <<= makeSite.dependsOn(tut)
