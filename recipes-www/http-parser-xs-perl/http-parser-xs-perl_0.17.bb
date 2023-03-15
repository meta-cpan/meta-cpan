DESCRIPTION = "HTTP::Parser::XS is a fast, primitive HTTP request/response parser."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Parser-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZUHO/HTTP-Parser-XS-0.17.tar.gz"

SRC_URI[md5sum] = "148579affbdfee247c47460924d6833d"
SRC_URI[sha256sum] = "794e6833e326b10d24369f9cdbfc1667105ef6591e8f41e561a3d41a7027a809"

S = "${WORKDIR}/HTTP-Parser-XS-${PV}"

EXTRA_PERLFLAGS = "-Mlib=."

inherit cpan

BBCLASSEXTEND = "native"
