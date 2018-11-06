DESCRIPTION = "By loading HTTP::XSHeaders anywhere, you replace any usage of HTTP::Headers \
and HTTP::Headers::Fast with a fast C implementation."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-XSHeaders"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/HTTP-XSHeaders-0.400004.tar.gz"

SRC_URI[md5sum] = "6c62477d96cf4bd9ad608008e1f9180e"
SRC_URI[sha256sum] = "61c83afb3943bfed2aadb38edb74ab4d8f9e768ad8411446380d9a8ab9d296db"

S = "${WORKDIR}/HTTP-XSHeaders-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
