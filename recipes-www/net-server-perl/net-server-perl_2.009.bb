DESCRIPTION = ""Net::Server" is an extensible, generic Perl server engine."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-Server"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RH/RHANDOM/Net-Server-2.009.tar.gz"

SRC_URI[md5sum] = "d45a0700d820b3eebd1e9e14611b1613"
SRC_URI[sha256sum] = "8267c6560355e2e0f483d3cc16195f342f32fe13cae9dde75a0a1ece5e9a813f"

S = "${WORKDIR}/Net-Server-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
