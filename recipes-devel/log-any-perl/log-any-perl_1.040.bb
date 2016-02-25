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

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Log-Any-1.040.tar.gz"

SRC_URI[md5sum] = "34e36f40d5a022f105bb179d5fb3e342"
SRC_URI[sha256sum] = "9759211bfc28055e4617894cf96c3b419e0c3c6afb4bdbfe2382f247193b3864"

S = "${WORKDIR}/Log-Any-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
