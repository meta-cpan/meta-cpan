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

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AM/AMBS/ExtUtils-CBuilder-0.280223.tar.gz"

SRC_URI[md5sum] = "54269e7cb7a5d995d28fc46933c6e045"
SRC_URI[sha256sum] = "116cb3ec29f42d9d03c1b06eb5c7382ae121f32e83b73fd8fc226c6275f15a33"

S = "${WORKDIR}/ExtUtils-CBuilder-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
