DESCRIPTION = "This module can read, modify, create and write Perl XS typemap files. \
If you don't know what a typemap is, please confer the perlxstut and perlxs \
manuals."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-ParseXS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SM/SMUELLER/ExtUtils-ParseXS-3.24.tar.gz"

SRC_URI[md5sum] = "e6be3f1d493e04ed805576104cf4328b"
SRC_URI[sha256sum] = "30b60b8208fc9b7746ed934b678bb9618a8f28994dae8774548353a7b550371e"

S = "${WORKDIR}/ExtUtils-ParseXS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
