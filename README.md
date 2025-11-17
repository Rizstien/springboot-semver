# springboot-semver
Java 21 Spring Boot example with automated semantic-release based versioning.
## How it works
1. Use **Conventional Commits** when committing changes (see https://
   www.conventionalcommits.org).
2. On push to `main`, `semantic-release` analyzes commits, bumps version
   (major/minor/patch), creates a Git tag `vX.Y.Z`, updates `CHANGELOG.md` and
   creates a GitHub Release.
3. After tagging, CI sets Maven project version from the tag and builds the
   artifact and Docker image

## Setup
1. Push to GitHub (create the repository and push this code).
2. Ensure GitHub Actions are enabled for the repo.
3. (Optional) Add `DOCKER_USERNAME` and `DOCKER_PASSWORD` secrets if you want
   the image pushed to Docker Hub.
## Local testing (without running semantic-release):
- Build normally: `mvn clean package`
- Run: `java -jar target/springboot-semver-0.0.0-SNAPSHOT.jar`
## Releasing locally (simulating semantic-release):
- Use `git tag v1.0.0` then run `mvn -B versions:set -DnewVersion=1.0.0` and
  build.