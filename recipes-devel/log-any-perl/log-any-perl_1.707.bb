DESCRIPTION = ""Log::Any" provides a standard log production API for modules. \
Log::Any::Adapter allows applications to choose the mechanism for log \
consumption, whether screen, file or another logging mechanism like \
Log::Dispatch or Log::Log4perl."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PR/PREACTION/Log-Any-1.707.tar.gz"

SRC_URI[md5sum] = "610f81b7b74859a105790347472dce34"
SRC_URI[sha256sum] = "74510f8cbee12637462e7c6020c8943d447a1e8e149a256f8168ee47562c65f1"

S = "${WORKDIR}/Log-Any-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
