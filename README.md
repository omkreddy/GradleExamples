#Introduction
sample gradle script to capture git hash/commitId, version info during build time. This script will generate a properties file (version.properties) with version, git-hash/commitId info in it and add that file to jar as a resource.

This properties file can be read in the application.
