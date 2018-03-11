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

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/WWW-Form-UrlEncoded-0.24.tar.gz"

SRC_URI[md5sum] = "f586b90fa142741728547dc2ea573f15"
SRC_URI[sha256sum] = "6d1f3bb519140dd2d6b2f9fc334e8369725c31cf5e68ac5acd90e6fa3e29d011"
DEPENDS += "json-perl-native"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/WWW-Form-UrlEncoded-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
