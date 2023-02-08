DESCRIPTION = "Devel::CheckBin is a perl module that checks whether a particular command \
is available."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-CheckBin"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOKUHIROM/Devel-CheckBin-0.04.tar.gz"

SRC_URI[md5sum] = "042b68e48d9b53de7d3ef4c726d57cb2"
SRC_URI[sha256sum] = "157f3db59c29ed1d49133a469cee772c885ad4ee64e8692a91b3ebfdbe2fe3e4"

S = "${WORKDIR}/Devel-CheckBin-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
