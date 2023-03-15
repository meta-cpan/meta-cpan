DESCRIPTION = "Stream::Buffered is a buffer class to store arbitrary length of byte \
strings and then get a seekable filehandle once everything is buffered. It \
uses PerlIO and/or temporary file to save the buffer depending on the \
length of the size."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Stream-Buffered"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DO/DOY/Stream-Buffered-0.03.tar.gz"

SRC_URI[md5sum] = "b030fecaa784cd573289ae797c7aeae9"
SRC_URI[sha256sum] = "9b2d4390b5de6b0cf4558e4ad04317a73c5e13dd19af29149c4e47c37fb2423b"

S = "${WORKDIR}/Stream-Buffered-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
