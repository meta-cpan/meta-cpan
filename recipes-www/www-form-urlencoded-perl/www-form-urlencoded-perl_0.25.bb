DESCRIPTION = "WWW::Form::UrlEncoded provides application/x-www-form-urlencoded parser and \
builder. This module aims to have compatibility with other CPAN modules \
like HTTP::Body's urlencoded parser."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/WWW-Form-UrlEncoded"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/WWW-Form-UrlEncoded-0.25.tar.gz"

SRC_URI[md5sum] = "c7f8fbd616f9a342b5ff726b405d2a96"
SRC_URI[sha256sum] = "e1f7a6d22fe558242d1df584229d99058f63ef2658e43b8a90642e3875c6074e"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/WWW-Form-UrlEncoded-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
