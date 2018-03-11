DESCRIPTION = "By loading HTTP::XSHeaders anywhere, you replace any usage of HTTP::Headers \
and HTTP::Headers::Fast with a fast C implementation."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-XSHeaders"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/HTTP-XSHeaders-0.400003.tar.gz"

SRC_URI[md5sum] = "e5c2b3fc1878afe94a091bcf932309d8"
SRC_URI[sha256sum] = "3b8414277d1da8cea1fc10987f8f3e53deba8b8ee85990fbb380d979c7fb3146"

S = "${WORKDIR}/HTTP-XSHeaders-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
