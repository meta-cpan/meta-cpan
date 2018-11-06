DESCRIPTION = "File::pushd does a temporary "chdir" that is easily and automatically \
reverted, similar to "pushd" in some Unix command shells. It works by \
creating an object that caches the original working directory. When the \
object is destroyed, the destructor calls "chdir" to revert to the original \
working directory. By storing the object in a lexical variable with a \
limited scope, this happens automatically at the end of the scope."

SECTION = "libs"
LICENSE = "Apachev2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-pushd"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/File-pushd-1.016.tar.gz"

SRC_URI[md5sum] = "1480e0d4813a8990c003e78338f00955"
SRC_URI[sha256sum] = "d73a7f09442983b098260df3df7a832a5f660773a313ca273fa8b56665f97cdc"

S = "${WORKDIR}/File-pushd-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
