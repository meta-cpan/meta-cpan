DESCRIPTION = "WWW::Form::UrlEncoded provides application/x-www-form-urlencoded parser and \
builder. This module aims to have compatibility with other CPAN modules \
like HTTP::Body's urlencoded parser."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/WWW-Form-UrlEncoded"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/WWW-Form-UrlEncoded-0.26.tar.gz"

SRC_URI[md5sum] = "cbe0e1c3ee54738d900c739ea348efda"
SRC_URI[sha256sum] = "c0480b5f1f15b71163ec327b8e7842298f0cb3ace97e63d7034af1e94a2d90f4"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/WWW-Form-UrlEncoded-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
