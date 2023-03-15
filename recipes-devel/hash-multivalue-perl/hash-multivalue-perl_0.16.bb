DESCRIPTION = "Hash::MultiValue is an object (and a plain hash reference) that may contain \
multiple values per key, inspired by MultiDict of WebOb."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-MultiValue"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARISTOTLE/Hash-MultiValue-0.16.tar.gz"

SRC_URI[md5sum] = "508015312eb08cd2bcea987c4efbb93d"
SRC_URI[sha256sum] = "66181df7aa68e2786faf6895c88b18b95c800a8e4e6fb4c07fd176410a3c73f4"

S = "${WORKDIR}/Hash-MultiValue-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
