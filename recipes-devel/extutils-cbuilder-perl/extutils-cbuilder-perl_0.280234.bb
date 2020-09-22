DESCRIPTION = "This module can build the C portions of Perl modules by invoking the \
appropriate compilers and linkers in a cross-platform manner. It was \
motivated by the "Module::Build" project, but may be useful for other \
purposes as well. However, it is *not* intended as a general cross-platform \
interface to all your C building needs. That would have been a much more \
ambitious goal!"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-CBuilder"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AM/AMBS/ExtUtils-CBuilder-0.280234.tar.gz"

SRC_URI[md5sum] = "3f2f188c6e15d3a531df0b5c3be86309"
SRC_URI[sha256sum] = "d80095ea1f28b4908cbedacead63f61f762472bba898281449dad782deecf1c3"

S = "${WORKDIR}/ExtUtils-CBuilder-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
