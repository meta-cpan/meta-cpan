DESCRIPTION = "This module can build the C portions of Perl modules by invoking the \
appropriate compilers and linkers in a cross-platform manner. It was \
motivated by the \"Module::Build\" project, but may be useful for other \
purposes as well. However, it is *not* intended as a general \
cross-platform \
interface to all your C building needs. That would have been a much \
more \
ambitious goal!"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-CBuilder"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AM/AMBS/ExtUtils-CBuilder-0.280219.tar.gz"

SRC_URI[md5sum] = "ded207aea4fd0912e26f78beaca8c6b3"
SRC_URI[sha256sum] = "216cd04b2c53ff7dc9e836c6b85942d40d019855429752c42f3adc0e84caf39e"

S = "${WORKDIR}/ExtUtils-CBuilder-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
