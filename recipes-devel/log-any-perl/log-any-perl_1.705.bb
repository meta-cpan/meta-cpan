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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PR/PREACTION/Log-Any-1.705.tar.gz"

SRC_URI[md5sum] = "df88170c61a569a357b797871a569ee3"
SRC_URI[sha256sum] = "85c7c5189a8bfc2ffb6f879b4cd04dd77f94bc5abc3800b4330f42f43fb9a696"

S = "${WORKDIR}/Log-Any-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
